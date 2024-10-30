// src/pages/Home/WeeklyBestCarousel.js
import React from "react";
import Slider from "react-slick";
import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";
import "./Home.css"; 

// 커스텀 화살표 컴포넌트에서 불필요한 props를 필터링
const PrevArrow = (props) => {
  const { onClick } = props; // 필요한 prop만 추출
  return (
    <button className="arrow prev" onClick={onClick}>
      ‹
    </button>
  );
};

const NextArrow = (props) => {
  const { onClick } = props; // 필요한 prop만 추출
  return (
    <button className="arrow next" onClick={onClick}>
      ›
    </button>
  );
};

const WeeklyBestCarousel = () => {
  const settings = {

    infinite: true,
    speed: 200,
    slidesToShow: 4,
    slidesToScroll: 1,
    autoplay: true,          
    autoplaySpeed: 2000, 
    nextArrow: <NextArrow />,
    prevArrow: <PrevArrow />,
  };

  return (
    <div className="carousel-container">
      <div className="carousel-header">
        <h2>WEEKLY BEST</h2>
        <p>지금 가장 사랑받는 상품입니다 :)</p>
      </div>
      <div className="carousel-wrapper">
      <Slider {...settings}>
        <div className="product-card">
          <img src="https://via.placeholder.com/150" alt="Product 1" />
        </div>
        <div className="product-card">
          <img src="https://via.placeholder.com/150" alt="Product 2" />
        </div>
        <div className="product-card">
          <img src="https://via.placeholder.com/150" alt="Product 3" />
        </div>
        <div className="product-card">
          <img src="https://via.placeholder.com/150" alt="Product 4" />
        </div>
      </Slider>
      </div>
    </div>
  );
};

export default WeeklyBestCarousel;
