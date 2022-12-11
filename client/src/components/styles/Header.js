import React from "react";
import styled from "styled-components";

const StyledHeader = styled.header`
  display: flex;
`;

const Header = ({ children }) => {
  return <StyledHeader>{children}</StyledHeader>;
};

export default Header;
