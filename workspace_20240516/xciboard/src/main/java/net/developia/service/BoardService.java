package net.developia.service;

import java.util.List;

import net.developia.domain.BoardVO;

public interface BoardService {
	public void register(BoardVO board) throws Exception;
	public BoardVO get(Long bno);
	public boolean modify(BoardVO board);
	public boolean remove(Long bno);
	public List<BoardVO> getList();
}