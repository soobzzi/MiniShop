
import './App.css';
import Header from './components/Header/Header';
import Navbar from './components/Navbar/Navbar';
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Profile from './modules/user/Profile';
import Home from './pages/home/Home';
import Login from './pages/auth/Login';
import Register from './pages/auth/Register';
import Cart from './modules/cart/Cart';




function App() {
  return (
    <Router>
      <div className="App">
          <Header />
          <Navbar />
          <Routes>
            <Route path="/" element={<Home />} /> 
            <Route path="/login" element={<Login />} />  
            <Route path="/register" element={<Register />} /> 
            <Route path="/profile" element={<Profile />} />   
            <Route path="/cart" element={<Cart />} />
          </Routes>
      </div>
    </Router>
  );
}

export default App;
