package Angelaprestano.ShopFootball.security;

import Angelaprestano.ShopFootball.entities.User;
import Angelaprestano.ShopFootball.exceptions.UnauthorizedException;
import Angelaprestano.ShopFootball.services.UserService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.UUID;
import java.util.stream.Stream;

@Component
    public class JWTAuthFilter extends OncePerRequestFilter {
        private static final AntPathMatcher pathMatcher = new AntPathMatcher();
        @Autowired
        private JWTTools jwTTools;
        @Autowired
        private UserService userService;
        @Override
        protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
            String authHeader = request.getHeader("Authorization");
            if (authHeader == null || !authHeader.startsWith("Bearer ")) {
                throw new UnauthorizedException("Per favore metti il token nell'Authorization header");
            } else {
                String accessToken = authHeader.substring(7);
                jwTTools.verifyToken(accessToken);

                String id = jwTTools.extractIdFromToken(accessToken);
                User user = userService.findById(UUID.fromString(id));

                Authentication authentication = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(authentication);
                filterChain.doFilter(request, response);
            }
        }
        @Override
        protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
            String[] allowedPaths = {"/auth/**", "/swagger-ui/**", "/v3/**"};

            return Stream.of(allowedPaths)
                    .anyMatch(path -> pathMatcher.match(path, request.getServletPath()));
        }
    }
