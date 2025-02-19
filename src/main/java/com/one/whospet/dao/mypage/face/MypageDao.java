package com.one.whospet.dao.mypage.face;

import java.util.HashMap;
import java.util.List;

import com.one.whospet.dto.Board;
import com.one.whospet.dto.Booking;
import com.one.whospet.dto.Hospital;
import com.one.whospet.dto.Payment;
import com.one.whospet.dto.Point;
import com.one.whospet.dto.ShopBasket;
import com.one.whospet.dto.User;
import com.one.whospet.dto.Userpic;
import com.one.whospet.util.MypageBoardPaging;

public interface MypageDao {
	/**
	 * user객체 안 userno에 따른 유저정보 가져오기
	 * @param user
	 * @return
	 */
	public User selectUserinfo(User user);

	/**
	 * 파일삽입
	 * @param userpic
	 */
	public void insertFile(Userpic userpic);
	
	/**
	 * 유저번호에 따른 사진 파일 찾아오기
	 * @param user
	 * @param userpic
	 * @return 
	 */
	public Userpic selectPicByUNo(User user);
	/**
	 * 유저번호에 따른 사진 파일 제거
	 * @param user
	 * @param userpic
	 */
	public void deleteUserPic(User user);

	/**
	 * 유저 정보 업데이트
	 * @param upuser
	 */
	public void updateUser(User upuser);

	/**
	 * 아이디와 패스워드가 일치하는 회원 찾기
	 * @param outuser
	 * @return
	 */
	public int selectUserCnt(User outuser);

	/**
	 * 회원삭제
	 * @param outuser
	 */
	public void deleteUser(User outuser);

	/**
	 * 글 목록 가져오기
	 * @param data 
	 * @return
	 */
	public List<Board> selectAllBoard(HashMap<String, Object> data);

	/**
	 * 총 게시글 수 조회
	 * @param data 
	 * @return
	 */
	public int selectBoardCntAll(HashMap<String, Object> data);

	/**
	 * 총 예약 수 조회
	 * @param data
	 * @return
	 */
	public int selectBookingCntAll(HashMap<String, Object> data);


	/**
	 * 총 예약 조회
	 * @param data
	 * @return
	 */
	public List<Booking> selectAllBooking(HashMap<String, Object> data);

	/**
	 * 예약번호를 받아 예약정보 가져오기
	 * @param bookno
	 * @return
	 */
	public Booking selectBookingByBookno(int bookno);

	/**
	 * 예약정보 취소로 상태변경
	 * @param bookno
	 */
	public void updateBookingCancel(Booking bookno);

	/**
	 * 포인트 행수 받아오기
	 * @param data
	 * @return
	 */
	public int selectPointCntAll(HashMap<String, Object> data);
	/**
	 * 유저 번호 별 포인트 이력을 받아옴
	 * @param data
	 * @return
	 */
	public List<Point> selectAllPoint(HashMap<String, Object> data);

	/**
	 * 유저번호로 마지막 포인트 행 가져오기
	 * @param uNo
	 * @return
	 */
	public Point selectLastPoint(int uNo);

	/**
	 * 병원 총게시글 조회
	 * @return
	 */
	public int selectHospitalCntAll();

	/**
	 * 총 병원목록 조회
	 * @param paging
	 * @return
	 */
	public List<Hospital> selectAllHospital(MypageBoardPaging paging);

	/**
	 * 총 예약 수 조회
	 * @return
	 */
	public int selectHosBookingCntAll();

	/**
	 * 총 예약 목록 조회
	 * @param paging
	 * @return
	 */
	public List<Booking> selectAllHosBooking(MypageBoardPaging paging);

	/**
	 * 선택된 병원들 제거
	 * @param map
	 * @return
	 */
	public int deleteHospitals(HashMap<String, Object> map);

	/**
	 * 예약상태 Y로 업데이트
	 * @param booking
	 * @return
	 */
	public void updateBookingStatusY(Booking booking);

	/**
	 * 예약상태N으로 업데이트
	 * @param booking
	 */
	public void updateBookingStatusN(Booking booking);

	/**
	 * 장바구니 수
	 * @param data 
	 * @return
	 */
	public int selectBasketCntAll(HashMap<String, Object> data);

	/**
	 * 장바구니 목록 조회
	 * @param data
	 * @return
	 */
	public List<ShopBasket> selectAllBasket(HashMap<String, Object> data);

	/**
	 * 장바구니 합계 계산
	 * @param data
	 * @return
	 */
	public Integer selectSumBasket(HashMap<String, Object> data);

	/**
	 * 장바구니 항목 삭제
	 * @param sbNo
	 * @return
	 */
	public int deleteBasket(int sbNo);

	/**
	 * 구매이력 수
	 * @param data
	 * @return
	 */
	public int selectPayCntAll(HashMap<String, Object> data);

	/**
	 * 구매이력 조회
	 * @param data
	 * @return
	 */
	public List<Payment> selectAllPay(HashMap<String, Object> data);

	/**
	 * 장바구니 수량 업데이트
	 * @param sbNo
	 * @return
	 */
	public int updatePlusBasket(int sbNo);

	/**
	 * 장바구니 수량 업데이트
	 * @param sbNo
	 * @return
	 */
	public int updateMinusBasket(int sbNo);









}
