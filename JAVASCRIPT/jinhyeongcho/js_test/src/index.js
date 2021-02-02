import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import ArraySortTest from "./array-test/ArraySortTest";
import ArraySortTest2 from "./array-test/ArraySortTest2";
import ApplyMathTest from "./apply-math/ApplyMathTest";
import CustomMathTest from "./custom-lib/CustomMathTest";
import SubOrderTest from "./custom-lib/SubOrderTest";
import SubOrderTest2 from "./custom-lib/SubOrderTest2";
import ArrayRepeatTest from "./repeat-test/ArrayRepeatTest";
import RepeatMapTest from "./repeat-test/RepeatMapTest";
import RepeatFilterTest from "./repeat-test/RepeatFilterTest";
import RepeatReduceTest from "./repeat-test/RepeatReduceTest";
import RepeatEveryTest from "./repeat-test/RepeatEveryTest";
import RepeatSomeTest from "./repeat-test/RepeatSomeTest";
import IndexTest from "./index-test/IndexTest";
import RepeatFindTest from "./repeat-test/RepeatFindTest";
import ArrowFunctionTest from "./array-test/ArrowFunctionTest";
import ArrowFunctionTest2 from "./array-test/ArrowFunctionTest2";
import ArrowFunctionTest3 from "./array-test/ArrowFunctionTest3";
import ArrowFunctionTest4 from "./array-test/ArrowFunctionTest4";
import FuncTest from "./func-test/FuncTest";
import DefaultParam from "./func-test/DefaultParam";
import Prob from "./homeWorks/02-02/Prob";


ReactDOM.render(
  <React.StrictMode>
    <ArraySortTest/>
    <ArraySortTest2/>
    <ApplyMathTest/>
    <CustomMathTest/>
    <SubOrderTest/>
    <SubOrderTest2/>
    <ArrayRepeatTest/>
    <RepeatMapTest/>
    <RepeatFilterTest/>
    <RepeatReduceTest/>
    <RepeatEveryTest/>
    <RepeatSomeTest/>
    <IndexTest/>
    <RepeatFindTest/>
    <ArrowFunctionTest/>
    <ArrowFunctionTest2/>
    <ArrowFunctionTest3/>
    <ArrowFunctionTest4/>
    <FuncTest/>
    <DefaultParam/>
    <Prob/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
