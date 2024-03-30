# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts/{id}`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인 `POST /session`
- 로그아웃 `DELETE /session`
- 회원가입 `POST /users`

### 내 정보

- 내 정보  `GET /users/me`
- 내 정보 수정  `PATCH /users/me`

### 상품

- 상품 목록 `GET /products`
- 상품 상세 `GET /products/{id}`

### 상품 리뷰

- 상품에 리뷰 작성 `POST /reviews?product_id={product_id}`
- 상품에 리뷰 수정 `PUT /reviews/{id}`
- 상품에 리뷰 삭제 `DELETE /reviews/{id}`

### 장바구니

- 장바구니에 상품 추가 `POST /cart/{product_id}`
- 장바구니에 상품 삭제 `DELETE /cart/{product_id}`
- 장바구니 (담긴 상품 목록) `GET /cart`

### 주문하기

- 주문하기 `POST /orders/me`
- 주문 목록 `GET /orders/me`

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?

일치할 필요 없다. 화면과 URL과 API의 URL이 일치해야 한다면,API에 근본적인 변화가 없음에도 화면의 요구사항과 구성이 달라질 때마다 API도 수정이 되어야한다. 화면 URL과 API의 URL이 분리되어야
프론트엔드와 백엔드가 독립적으로 발전할 수 있다.

> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

요청시 같이 전달된 쿠키 혹은 세션을 통해 사용자가 누구인지 알 수 있다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?

개인 정보를 요청하는 API는 요청 수행 전에 정당한 토큰이나 세션 ID가 전달되었는지 확인하여야 한다.
