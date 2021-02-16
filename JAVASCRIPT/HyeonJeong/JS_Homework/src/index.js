import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import Series from './hw_21_02_01/Series';
import DuplicateArray from './hw_21_02_01/DuplicateArray';

ReactDOM.render(
  <React.StrictMode>
    {/* <RandomMember/> */}
    <Series/>
    <DuplicateArray/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
