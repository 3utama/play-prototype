package services

import models.User
import play.api.db._
import play.api.Play.current
import anorm._
import anorm.SqlParser._
import java.sql.Timestamp

object UserService {
  /**
	private val * = {
	  int("id") ~ str("name") ~ str("email") ~ str("password") ~
	  date("createDate") map {
	    case id ~ name ~ email ~ password ~ createDate =>
	      User(Some(id), name, email, password, Some(new Timestamp(createDate.getTime())))
	  }
	}

	def findByPk (id: Long): Option[User] = {
	  DB.withConnection { implicit c =>
	    SQL("select * from User where id = {id}")
	    .on('id -> id)
	    .as(*.singleOpt)
	  }
	}

	def entry(name: String, email: String, password: String): Option[Long] = {
	  DB.withConnection { implicit c =>
	    SQL(
	        """ 
	        insert into User (name, email, password) values({name}, {email}, {password})
	        """)
	        .on('naem -> name, 'email -> email, 'password -> password)
	        .executeInsert()
	  }
	}
	*/
}