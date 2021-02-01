import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';

import FinalEqCicdTest from "./coincidence/FinalEqCicdTest";
import SpreadTest from "./array/SpreadTest";
import SpreadTest2 from "./array/SpreadTest2";
import SpreadTest3 from "./array/SpreadTest3";
import SpreadTest4 from "./array/SpreadTest4";
import SpreadTest5 from "./array/SpreadTest5";
import SpreadTest6 from "./array/SpreadTest6";
import SpreadTest7 from "./array/SpreadTest7";
import EmptyObjectTest from "./function/EmptyObjectTest";
import FunctionObjectTest from "./function/FunctionObjectTest";
import FunctionObjectTest2 from "./function/FunctionObjectTest2";
import RandomTeam from "./Js_Home2/RandomTeam"
import Hint from "./Js_Home2/Hint";
import TestPp from "./Js_Home/TestPp";
import LiteralTest from "./literal/LiteralTest";

ReactDOM.render(
  <React.StrictMode>
    <LiteralTest/>
    <FinalEqCicdTest/>
    <SpreadTest/>
    <SpreadTest2/>
    <SpreadTest3/>
    <SpreadTest4/>
    <SpreadTest5/>
    <SpreadTest6/>
    <SpreadTest7/>
    <EmptyObjectTest/>
    <FunctionObjectTest/>
    <FunctionObjectTest2/>
    <RandomTeam/>
    <LiteralTest/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
