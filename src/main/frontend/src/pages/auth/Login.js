
import React from 'react';


const Login = () => {
  return (
    <div className="auth-container">
      <h2>LOGIN</h2>
      <div className="login-form">
        <input type="text" placeholder="ID" />
        <input type="password" placeholder="PW" />
        <button className="login-button">LOGIN</button>
      </div>
      <div className="options">
        <label><input type="checkbox" /> 보안접속</label>
        <button className="kakao-login">카카오계정 로그인</button>
      </div>
      <div className="membership">
        <h3>MEMBERSHIP</h3>
        <p>회원가입을 하시면 다양한 혜택이 준비되어 있습니다.</p>
        <div className="membership-options">
          <button>회원가입</button>
          <button>비회원주문조회</button>
          <button>아이디찾기</button>
          <button>비밀번호찾기</button>
        </div>
      </div>
    </div>
  );
};

export default Login;
