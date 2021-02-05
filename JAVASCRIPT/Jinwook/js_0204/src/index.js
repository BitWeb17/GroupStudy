import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import GeneratorTest from './generator-test/GeneratorTest';
import NonpromiseTest from './js_generator/promise-asynchronous/promise-test/NonpromiseTest';
import NonpromiseTest2 from './js_generator/promise-asynchronous/promise-test/NonpromiseTest2';
import PromiseTest from './js_generator/promise-asynchronous/promise-test/PromiseTest';
import PromiseTest2 from './js_generator/promise-asynchronous/promise-test/PromiseTest2';
import PromiseTest3 from './js_generator/promise-asynchronous/promise-test/PromiseTest3';
import PromiseTest4 from './js_generator/promise-asynchronous/promise-test/PromiseTest4';
import PromiseTest5 from './js_generator/promise-asynchronous/promise-test/PromiseTest5';
import PromiseTest6 from './js_generator/promise-asynchronous/promise-test/PromiseTest6';
import PromiseTest7 from './js_generator/promise-asynchronous/promise-test/PromiseTest7';
import PromiseTest8 from './PromiseTest8';
import reportWebVitals from './reportWebVitals';

ReactDOM.render(
  <React.StrictMode>
    <GeneratorTest/>
    <NonpromiseTest/>
    <NonpromiseTest2/>
    <PromiseTest/>
    <PromiseTest2/>
    <PromiseTest3/>
    <PromiseTest4/>
    <PromiseTest5/>
    <PromiseTest6/>
    <PromiseTest7/>
    <PromiseTest8/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
