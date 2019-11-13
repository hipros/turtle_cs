package npclinic.cs.mapper.board;

import npclinic.cs.dto.board.BoardDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("SELECT * FROM board WHERE dropMenuId = #{drop_menu_id}")
    List<BoardDTO> getAllBoardByDropMenuId(@Param("drop_menu_id") int drop_menu_id);

    @Select("SELECT * FROM board WHERE id = #{id}")
    BoardDTO getBoardById(@Param("id") int id);

    @Insert("INSERT INTO board VALUES(#{user_id}, #{title}, #{views}, #{last_modified}, #{content}, #{drop_menu_id})")
    void insertBoard(BoardDTO boardDTO);

    @Update("UPDATE board SET title=#{title}, last_modified=#{last_modified}, content=#{content}")
    void updateBoard(BoardDTO boardDTO);

    @Delete("DELETE board WHERE id=#{id}")
    void deleteBoard(BoardDTO boardDTO);
}