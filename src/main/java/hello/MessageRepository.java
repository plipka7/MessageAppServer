package hello;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import hello.Message;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MessageRepository extends JpaRepository<Message, Integer> {
	@Query("select m from Message m "
			+ "where (m.receiverUsername = :username and m.senderUsername = :friendName) "
			+ "or (m.senderUsername = :username and m.receiverUsername = :friendName) "
			+ "order by m.timeStamp")
	public List<Message> findMessagesForConversation(@Param("username") String username, @Param("friendName") String friendName);
}