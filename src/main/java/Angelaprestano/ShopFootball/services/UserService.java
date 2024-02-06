package Angelaprestano.ShopFootball.services;

import Angelaprestano.ShopFootball.entities.User;
import Angelaprestano.ShopFootball.exceptions.NotFoundException;
import Angelaprestano.ShopFootball.repositories.UserDAO;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

public class UserService {
    @Autowired
    UserDAO userDAO;
    @Autowired
    Cloudinary cloudinary;

    public Page<User> findAll(int size, int page, String order){
        Pageable pageable= PageRequest.of(size,page, Sort.by(order));
        return userDAO.findAll(pageable);
    }

    public  User findById(UUID userId){
        return userDAO.findById(userId).orElseThrow(()->new NotFoundException(userId));
    }

    public User userUpdate(UUID userId,User body){
        User update=this.findById(userId);
        update.setName(body.getName());
        update.setSurname(body.getSurname());
        update.setEmail(body.getEmail());
        update.setPassword(body.getPassword());
        update.setAvatar(body.getAvatar());
        update.setRole(body.getRole());
        return userDAO.save(update);
    }


    public void userDelete(UUID userId){
        User delete=this.findById(userId);
        userDAO.delete(delete);
    }

    public User findByEmail(String email){
        return userDAO.findByEmail(email).orElseThrow(()-> new NotFoundException("Utente con email " + email + " non trovato..."));
    }

    public  String uploadImage(MultipartFile file, UUID userId) throws IOException {
        User found = this.findById(userId);
        String url = (String) cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap()).get("url");
        found.setAvatar(url);
        userDAO.save(found);
        return url;
    }
}
