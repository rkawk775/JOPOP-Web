package com.jopop.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jopop.mapper.MemberMapper;
import com.jopop.model.Criteria;
import com.jopop.model.MemberVO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class MemberServiceImpl implements MemberService {

	private static final Logger log = LoggerFactory.getLogger(MemberServiceImpl.class);
	
		@Autowired
		MemberMapper membermapper;
		
		//회원가입
		@Override
		public void memberJoin(MemberVO member) throws Exception{
			membermapper.memberJoin(member);
		}
		
		//아이디 중복체크
		@Override
		public int idCheck(String mEmail) throws Exception{
			return membermapper.idCheck(mEmail);
		}
		
		//로그인 
		@Override
		public MemberVO memberLogin(MemberVO member) throws Exception{
			
			return membermapper.memberLogin(member);
		}

		@Override
		public int memberDrop(int mId) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		//주문자 정보
		@Override
		public MemberVO getMemberInfo(int mId) {
			return membermapper.getMemberInfo(mId);
		}

		@Override
		public List memberGetList(Criteria cri) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object memberGetDetail(int mId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int memberModify(MemberVO vo) {
			// TODO Auto-generated method stub
			return 0;
		}
		
				
		
	
		
}
