import React from "react";
import { FaHeart, FaShoppingCart, FaSearch } from "react-icons/fa";
import "./Header.css";

const Header = () => {
  return (
    <header className="header">
      <div className="header-left">
        <span className="header-link">LOGIN</span>
        <span className="header-link">JOIN US</span>
        <span className="header-link">MY PAGE <span className="dropdown-arrow">▼</span></span>
        <button className="reward-button">+2,000</button>
      </div>
      <div className="header-center">
        <h1 className="logo">CLASSIC BLANC</h1>
      </div>
      <div className="header-right">
        <div className="search-box">
          <input type="text" placeholder="Search" />
          <FaSearch className="search-icon" />
        </div>
        <div className="icon-container">
          <FaHeart className="icon" />
          <span className="badge">0</span>
        </div>
        <div className="icon-container">
          <FaShoppingCart className="icon" />
          <span className="badge">0</span>
        </div>
      </div>
    </header>
  );
};

export default Header;
