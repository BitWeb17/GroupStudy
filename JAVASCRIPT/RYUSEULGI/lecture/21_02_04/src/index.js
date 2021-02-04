import React from 'react';
import ReactDOM from 'react-dom';
import Test from './Review/Test';
import GeneratorTest from './Test/GeneratorTest';
import NonPromise from './Test/NonPromise';
import NonPromisTest from './Test/NonPromisTest';
import ParallelTest from './Test/ParallelTest';
import Promise3 from './Test/Promise3';
import PromiseTest from './Test/PromiseTest';

ReactDOM.render(
  <React.StrictMode>
    <Test />
    <GeneratorTest />
    <NonPromise /> 
    <NonPromisTest />
    <PromiseTest />
    <Promise3 />
    <ParallelTest />
  </React.StrictMode>,
  document.getElementById('root')
);
