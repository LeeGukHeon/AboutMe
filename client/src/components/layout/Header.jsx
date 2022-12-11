import React from "react";
import logo from "../../assets/logo.png";
import styled from "styled-components";
import { Link } from "react-router-dom";
import StyledHeader from "../styles/Header";
const Header = () => {
  return (
    <React.Fragment>
      <StyledHeader>
        <img src={logo} alt="logo" />
        <ul>
          <li>
            <Link>메뉴1</Link>
          </li>
          <li>
            <Link>메뉴1</Link>
          </li>
          <li>
            <Link>메뉴1</Link>
          </li>
          <li>
            <Link>메뉴1</Link>
          </li>
        </ul>
      </StyledHeader>
    </React.Fragment>
  );
};

export default Header;
