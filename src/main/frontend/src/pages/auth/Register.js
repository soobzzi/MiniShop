
import React from 'react';


const Register = () => {
  return (
    <div className="auth-container">
      <h2>회원가입</h2>
      <form className="register-form">
        <input type="text" placeholder="아이디" required />
        <input type="password" placeholder="비밀번호" required />
        <input type="password" placeholder="비밀번호 확인" required />
        <input type="text" placeholder="이름" required />
        <input type="email" placeholder="이메일" required />
        <button type="submit" className="register-button">회원가입</button>
      </form>
    </div>
  );
};

export default Register;
