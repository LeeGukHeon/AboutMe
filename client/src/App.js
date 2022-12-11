import { Route, Routes, BrowserRouter } from "react-router-dom";
import React from "react";
import Regist from "./components/pages/regist/Regist";
import Header from "./components/layout/Header";
import Footer from "./components/layout/Footer";
import GlobalStyles from "./components/styles/GlobalStyles";
import Home from "./components/pages/home/Home";

function App() {
  return (
    <BrowserRouter>
      <GlobalStyles />
      <Header />
      <main>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/regist" element={<Regist />} />
        </Routes>
      </main>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
