/**
*
* @FileName
* IShelfRepository.java
* @Project
* LgMcs
* @Date
* 2022. 12. 11.
* @Writter
* kumh2
* @EditHistory
*
* @Discript
*
*/
package com.lgcns.mcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgcns.mcs.entity.Shelf;
import com.lgcns.mcs.entity.ShelfPk;


public interface IShelfRepository extends JpaRepository<Shelf, ShelfPk> {

}
