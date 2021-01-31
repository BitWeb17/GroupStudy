import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';

import RandomMember from "./21_01_29/RandomMember";
import HW04 from './21_01_29/homework/HW04';

ReactDOM.render(
  <React.StrictMode>
      <RandomMember/>
      {/* <HW04/> */}
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

