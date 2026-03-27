package com.example.webapp.form;

import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDoForm {
	
	private Integer id;
	
	@NotBlank(message = "ToDoは必須です。")
	
	
	private String todo;
	
	private String detail;
	
	private Boolean isNew;

}
