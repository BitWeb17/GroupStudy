import React from 'react';
import ReactDOM from 'react-dom';
import GeneratorTest from './generator-test/GeneratorTest';
import './index.css';
import NonPromiseTest from './promise-asynchronous/NonPromiseTest';
import NonPromiseTest2 from './promise-asynchronous/NonPromiseTest2';
import reportWebVitals from './reportWebVitals';

ReactDOM.render(
  <React.StrictMode>
    <GeneratorTest/>
    <NonPromiseTest/>
    <NonPromiseTest2/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
