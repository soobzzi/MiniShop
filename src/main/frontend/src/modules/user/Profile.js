
import React from 'react';
import './User.css';

const Profile = () => {
  return (
    <div className="profile-container">
      <h2>내 정보 보기</h2>
      <table className="profile-table">
        <tbody>
          <tr>
            <th>아이디</th>
            <td>user123</td>
          </tr>
          <tr>
            <th>이름</th>
            <td>홍길동</td>
          </tr>
          <tr>
            <th>이메일</th>
            <td>user123@example.com</td>
          </tr>
          <tr>
            <th>가입일</th>
            <td>2023-01-01</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
};

export default Profile;
