package com.jopop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jopop.model.CateFilterVO;
import com.jopop.model.Criteria;
import com.jopop.model.PopVO;
import com.jopop.model.RatingDTO;
import com.jopop.model.ReviewVO;
import com.jopop.model.RimageVO;

public interface PopMapper {
    // 상품 상세 정보
    public PopVO PopGoodsInfo(int pid) throws Exception;

    // 상품 검색
    public List<PopVO> getGoodsList(Criteria cri) throws Exception;

    // 상품 총 갯수
    public int goodsGetTotal(Criteria cri) throws Exception;
    
    /* 인기 있는 순 리스트 */
    public List<RatingDTO> rating() throws Exception;
    
    
    /* 검색 대상 카테고리 리스트 */
    public String[] getCateList(Criteria cri);
    
    /* 카테고리 정보 (+검색 대상 갯수) */
    public CateFilterVO getCateInfo(Criteria cri);
    
    
    
    

    // 리뷰 추가
    public void addReview(ReviewVO review) throws Exception;
    
    // 이미지 추가 메서드
    public void addImage(RimageVO image) throws Exception;

    // 리뷰 조회
    public List<ReviewVO> getReviewsByPid(int pid) throws Exception;
    
    // 특정 리뷰에 해당하는 이미지 리스트를 가져오는 메서드 추가
    public List<RimageVO> getImagesByReviewId(@Param("mId") int mId, @Param("pId") int pId) throws Exception;

    // [마이페이지 - 리뷰] 회원정보에 맞는 상품명 출력
    public List<ReviewVO> getMyPageReivew(int mId) throws Exception;
    
    // [마이페이지 - 리뷰/이미지] 수정
    void modifyReviewAndImages(ReviewVO review, List<RimageVO> images) throws Exception;
    
    // [마이페이지] 리뷰 수정
    public void modifyReview(ReviewVO review) throws Exception;
    
    // [마이페이지] 이미지 수정
    public void modifyImage(RimageVO image) throws Exception;
    
    // 리뷰 내용
    public int deleteReview(PopVO pop);
    
    // 리뷰 이미지 삭제
    public int deleteRImage(PopVO pop);
    
    // 내주변 지도 모든 장소 정보 조회 (위도와 경도 포함 + 마커 찍기 )
    public List<PopVO> getAllLocations() throws Exception;
    
    
    
}
