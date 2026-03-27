package com.example.webapp.entity;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDo {
	
	private Integer id;
	
	private String todo;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;

	public void setDetail(String detail) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	public String getDetail() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable Integer id, RedirectAttributes attributes) {
		
		toDoService.deleteToDo(id);
		
		attributes.addFlashAttribute("message", "ToDoが削除されました");
		
		return "redirect:/todos";
	}

		

}
