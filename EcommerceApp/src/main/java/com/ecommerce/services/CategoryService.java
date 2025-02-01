package com.ecommerce.services;

import com.ecommerce.entites.Category;
import com.ecommerce.payloads.CategoryDTO;
import com.ecommerce.payloads.CategoryResponse;

public interface CategoryService {

	CategoryDTO createCategory(Category category);

	CategoryResponse getCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

	CategoryDTO updateCategory(Category category, Long categoryId);

	String deleteCategory(Long categoryId);
}
