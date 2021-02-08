import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import GeneratorTest from './21_02_04/generator/GeneratorTest';
import NonPromiseTest from './21_02_04/promiseAsynchronous/NonPromiseTest';
import NonPromiseTest2 from './21_02_04/promiseAsynchronous/NonPromiseTest2';
import PromiseTest from './21_02_04/promiseAsynchronous/PromiseTest';
import PromiseTest2 from './21_02_04/promiseAsynchronous/PromiseTest2';
import PromiseTest3 from './21_02_04/promiseAsynchronous/PromiseTest3';
import PromiseTest4 from './21_02_04/promiseAsynchronous/PromiseTest4';
import PromiseTest5 from './21_02_04/promiseAsynchronous/PromiseTest5';
import PromiseTest6 from './21_02_04/promiseAsynchronous/PromiseTest6';
import PromiseTest7 from './21_02_04/promiseAsynchronous/PromiseTest7';
import PromiseTest8 from './21_02_04/promiseAsynchronous/PromiseTest8';
import PromiseParallelTest from './21_02_04/promiseAsynchronous/PromiseParallelTest';

ReactDOM.render(
  <React.StrictMode>
    <GeneratorTest/>
    <NonPromiseTest/>
    <NonPromiseTest2/>
    <PromiseTest/>
    <PromiseTest2/>
    <PromiseTest3/>
    <PromiseTest4/>
    <PromiseTest5/>
    <PromiseTest6/>
    <PromiseTest7/>
    <PromiseTest8/>
    <PromiseParallelTest/>

  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

