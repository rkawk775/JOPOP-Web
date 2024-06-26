package com.jopop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jopop.mapper.AttachMapper;
import com.jopop.mapper.CartMapper;
import com.jopop.model.CartVO;
import com.jopop.model.ImageVO;
import com.jopop.model.MemberVO;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartMapper cartMapper;
	
	@Autowired
	AttachMapper attachMapper;
	
	
	
	//찜 추가
	@Override
	public int addCart(CartVO cart) throws Exception{
		//0:등록 실패, 1: 등록 성공, 2: 등록된 데이터 존재, 5: 로그인 필요
		System.out.println("CartServiceImpl 까지는 왔음");
		
		//찜 데이터 체크
		CartVO checkCart = cartMapper.checkCart(cart);
		System.out.println(checkCart);
		
		if(checkCart != null) {
			return 2;
		}
		
		//찜 등록 & 에러 시 0 반환
		try {
			return cartMapper.addCart(cart);
		}catch(Exception e) {
			return 0;
		}
	}

	//찜 삭제
	@Override
	public int deleteCart(int pId) {
		return cartMapper.deleteCart(pId);
	}

	//찜 목록
	@Override
	public List<CartVO> getCart(int mId) {
		
		List<CartVO> cart = cartMapper.getCart(mId);
		
		for(CartVO vo : cart) {
			//이미지 정보 얻기
			int pId = vo.getpId();
			
			List<ImageVO> imageList = attachMapper.getImageList(pId);
			
			vo.setImageList(imageList);
		}
		
		return cart;
	}

	 //찜 확인 
	   @Override
	    public CartVO checkCart(CartVO cart) {
	        CartVO result = cartMapper.checkCart(cart);
	        // 디버깅 로그 추가
	        System.out.println("Cart check result: " + result);
	        return result;
	    }

	//찜 키워드 검색 (지역명, 팝업명)
	@Override
	public List<CartVO> searchCart(MemberVO cart) {
		
		List<CartVO> scart = cartMapper.searchCart(cart);
		
		return scart;
	}

}
