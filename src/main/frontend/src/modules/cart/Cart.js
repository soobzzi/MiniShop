// src/modules/cart/Cart.js
import React from 'react';
import { Container, Typography, Grid, Button, Divider, Box } from '@mui/material';
import RemoveCircleOutlineIcon from '@mui/icons-material/RemoveCircleOutline';
import AddCircleOutlineIcon from '@mui/icons-material/AddCircleOutline';
import DeleteIcon from '@mui/icons-material/Delete';

const Cart = () => {
  // 임의의 아이템 데이터
  const items = [
    { id: 1, name: '클렌징 오일', size: '50ml', price: 15000, quantity: 2 },
    { id: 2, name: '수분크림', size: '100ml', price: 25000, quantity: 1 },
    { id: 3, name: '자외선 차단제', size: '30ml', price: 12000, quantity: 3 },
  ];

  // 총 금액 계산 (임의의 값)
  const totalAmount = items.reduce((total, item) => total + item.price * item.quantity, 0);

  return (
    <Container maxWidth="md" sx={{ mt: 5 }}>
      <Typography variant="h4" align="center" gutterBottom>
        장바구니
      </Typography>
      <Divider sx={{ mb: 3 }} />
      
      {/* 장바구니 아이템 목록 */}
      <Grid container spacing={2}>
        <Grid item xs={12} md={8}>
          {items.map((item) => (
            <Box key={item.id} sx={{ display: 'flex', alignItems: 'center', mb: 2, p: 2, border: '1px solid #ddd', borderRadius: 2 }}>
              <img src="https://via.placeholder.com/80" alt={item.name} style={{ width: 80, height: 80, marginRight: 16 }} />
              <Box sx={{ flex: 1 }}>
                <Typography variant="h6">{item.name}</Typography>
                <Typography variant="body2" color="textSecondary">{item.size}</Typography>
                <Typography variant="body1" color="textPrimary">{item.price.toLocaleString()}원</Typography>
              </Box>
              <Box sx={{ display: 'flex', alignItems: 'center', gap: 1 }}>
                <Button><RemoveCircleOutlineIcon /></Button>
                <Typography variant="body1">{item.quantity}</Typography>
                <Button><AddCircleOutlineIcon /></Button>
              </Box>
              <Button variant="text" color="error" startIcon={<DeleteIcon />}>
                삭제
              </Button>
            </Box>
          ))}
        </Grid>

        {/* 주문 요약 */}
        <Grid item xs={12} md={4}>
          <Box sx={{ p: 3, border: '1px solid #ddd', borderRadius: 2 }}>
            <Typography variant="h6" gutterBottom>
              총 주문 금액
            </Typography>
            <Divider sx={{ mb: 2 }} />
            <Box>
              <Typography variant="body2">주문상품 수: {items.length}개</Typography>
              <Typography variant="body2">주문금액: {totalAmount.toLocaleString()}원</Typography>
              <Typography variant="h6" color="error" sx={{ mt: 2 }}>
                최종결제금액: {totalAmount.toLocaleString()}원
              </Typography>
            </Box>
          </Box>
        </Grid>
      </Grid>

      {/* 하단 버튼 */}
      <Box sx={{ mt: 4, display: 'flex', justifyContent: 'space-around' }}>
        <Button variant="outlined">쇼핑하러 가기</Button>
        <Button variant="outlined">선택상품구매</Button>
        <Button variant="contained" color="primary">전체상품구매</Button>
      </Box>
    </Container>
  );
};

export default Cart;
