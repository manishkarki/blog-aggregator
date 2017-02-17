package com.manish.blogaggregator.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manish.blogaggregator.entity.Blog;
import com.manish.blogaggregator.entity.Item;
import com.manish.blogaggregator.entity.Role;
import com.manish.blogaggregator.entity.User;
import com.manish.blogaggregator.repository.BlogRepository;
import com.manish.blogaggregator.repository.ItemRepository;
import com.manish.blogaggregator.repository.RoleRepository;
import com.manish.blogaggregator.repository.UserRepository;
@Transactional
@Service
public class InitDbService {
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ItemRepository itemRepository;
	@Autowired
	private BlogRepository blogRepository;
	@PostConstruct
	public void init(){
		Role roleUser=new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin=new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin=new User();
		userAdmin.setName("admin");
		List<Role> roles=new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		Blog blogJavavids=new Blog();
		blogJavavids.setName("JavaVids");
		blogJavavids.setUrl("http://www.javavids.com");
		blogJavavids.setUser(userAdmin);
		blogRepository.save(blogJavavids);
		
		Item item1=new Item();
		item1.setBlog(blogJavavids);
		item1.setTitle("first");
		item1.setLink("http://feeds.feedburner.com/javavids");
		item1.setPublishDate(new Date());
		itemRepository.save(item1);
		
		Item item2=new Item();
		item2.setBlog(blogJavavids);
		item2.setTitle("Second");
		item2.setLink("http://feeds.feedburner.com/javavids");
		item2.setPublishDate(new Date());
		itemRepository.save(item2);
		
	}
}
