import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Homework1 from './jan0201/Homework1';
import Homework2 from './jan0201/Homework2';
import Homework3 from './jan0201/Homework3';
import TwoHomework1 from './jan0202/TwoHomework1';
import Prob from './jan0202/prob';
import reportWebVitals from './reportWebVitals';


ReactDOM.render(
  <React.StrictMode>
    <TwoHomework1/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
