package com.jopop.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jopop.mapper.AttachMapper;
import com.jopop.mapper.PopMapper;
import com.jopop.model.Criteria;
import com.jopop.model.ImageVO;
import com.jopop.model.PopVO;
import com.jopop.model.RatingDTO;
import com.jopop.model.ReviewVO;
import com.jopop.model.RimageVO;

@Service
public class PopServiceimpl implements PopService {
    @Autowired
    private PopMapper popMapper;
    
    @Autowired
    private AttachMapper attachMapper;

    // 상품 상세 정보
    @Override
    public PopVO PopGoodsInfo(int pid) throws Exception {
        return popMapper.PopGoodsInfo(pid);
    }

    // 상품 검색
    @Override
    public List<PopVO> getGoodsList(Criteria cri) throws Exception {
    	
    	List<PopVO> list = popMapper.getGoodsList(cri);
    	
    	list.forEach(pop ->{
    		
    		int pId = pop.getpId();
    		
    		List<ImageVO> imageList = attachMapper.getImageList(pId);
    		
    		pop.setImageList(imageList);
    	});
    	return list;
    }

    // 상품 총 갯수
    @Override
    public int goodsGetTotal(Criteria cri) throws Exception {
        return popMapper.goodsGetTotal(cri);
    }
    

    // 리뷰 및 이미지 추가
    @Override
    @Transactional
    public void addReviewAndImages(ReviewVO review, List<RimageVO> images) throws Exception {
        popMapper.addReview(review);
        if (images != null && !images.isEmpty()) {
            for (RimageVO image : images) {
                image.setpId(review.getpId());
                image.setmId(review.getmId());
                popMapper.addImage(image);
            }
        }
    }

    // 리뷰 조회
    @Override
    public List<ReviewVO> getReviewsByPid(int pid) throws Exception {
        return popMapper.getReviewsByPid(pid);
    }
    //특정 리뷰에 대한 이미지 조회
    @Override
    public List<RimageVO> getImagesByReviewId(int mId, int pId) throws Exception {
        return popMapper.getImagesByReviewId(mId, pId);
    }
    
    //[마이페이지 - 리뷰] 회원정보에 맞는 상품명 출력
	@Override
	public List<ReviewVO> getMyPageReivew(int mId) throws Exception {
		
		return popMapper.getMyPageReivew(mId);
	}

	// 리뷰 내용 삭제
	@Override
	public int deleteReview(int pId, int mId) {
		System.out.println("실행  pId : "+pId+" , mId: "+mId);
		return popMapper.deleteReview(pId, mId);
	}
	
	
	//리뷰 이미지 삭제
	@Override
	public int deleteRImage(int pId, int mId) {
		System.out.println("PopServiceImpl까지는 옴");
		
		return popMapper.deleteReview(pId, mId);
	}

	public void addReview(ReviewVO review) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RatingDTO> rating() throws Exception {
		
		List<RatingDTO> list = popMapper.rating();
		
		list.forEach(dto ->{
			
			int pId = dto.getpId();
			
			List<ImageVO> imageList = attachMapper.getImageList(pId);
			
			dto.setImageList(imageList);
		});
		
		return list;
	}

}
