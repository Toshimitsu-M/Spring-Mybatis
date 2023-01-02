package dev.itboot.mb.model;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginUser {
	private Long id;
	
	@NotBlank
	@Email
	@Size(max = 254)
	private String email;
	
	@NotBlank
	@Size(max = 60)
	private String name;
	
	@NotBlank
	@Size(max = 254)
	private String password;
	
	private List<String> roleList;
}

//public record LoginUser(String email, String name, String password, List<String> roleList)