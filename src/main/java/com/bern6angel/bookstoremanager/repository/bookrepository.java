package com.bern6angel.bookstoremanager.repository;

import com.bern6angel.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookrepository extends JpaRepository<Book,Long> {

}
