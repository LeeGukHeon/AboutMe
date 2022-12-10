import React from "react";
import styled from "styled-components";

const StyledButton = styled.button`
  /* 주석은 이렇게 */

  /* 공통 스타일 */
  padding: 10px 16px;
  border-radius: 3px;
  /* 색깔 */
  background-color: blue;
  color: white;
  /* 특수 */
  &:hover {
    background: red;
  }
`;

const Button = ({ children }) => {
  return <StyledButton>{children}</StyledButton>;
};

export default Button;
