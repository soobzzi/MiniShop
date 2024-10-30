import React from "react";
import "./Navbar.css";

const Navbar = () => {
  return (
    <nav className="navbar">
      <ul className="navbar-menu">
        <li className="menu-item">MADE</li>
        <li className="menu-item">전체상품</li>
        <li className="menu-item highlight">BEST 30</li>
        <li className="menu-item">원피스/세트</li>
        <li className="menu-item">상의</li>
        <li className="menu-item">하의</li>
        <li className="menu-item">아우터</li>
        <li className="menu-item">가방/신발/언더웨어</li>
        <li className="menu-separator">/</li>
        <li className="menu-item">NOTICE</li>
        <li className="menu-item">Q & A</li>
        <li className="menu-item">REVIEW</li>
      </ul>
    </nav>
  );
};

export default Navbar;
