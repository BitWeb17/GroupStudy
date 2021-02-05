import React from 'react';
import ReactDOM from 'react-dom';
import ApplyMathTest from './apply-math/ApplyMathTest';
import ArraySortTest from './array-test/ArraySortTest';
import ArraySortTest2 from './array-test/ArraySortTest2';
import CustomMathTest from './custom-lib/CustomMathTest';
import SubOrderTest from './custom-lib/SubOrderTest';
import SubOrderTest2 from './custom-lib/SubOrderTest2';
import IndexTest from './index-test/IndexTest';
import './index.css';
import ArrayRepeatTest from './repeat-test/ArrayRepeatTest';
import RepeatEveryTest from './repeat-test/RepeatEveryTest';
import RepeatFilterTest from './repeat-test/RepeatFilter';
import RepeatFindTest from './repeat-test/RepeatFindTest';
import RepeatMapTest from './repeat-test/RepeatMapTest';
import RepeatSomeTest from './repeat-test/RepeatSomeTest';
import RepeatReduceTest from './repeat-test/RepeqtReduceTest';
import reportWebVitals from './reportWebVitals';

ReactDOM.render(
  <React.StrictMode>
    <ApplyMathTest/>
    <ArraySortTest/>
    <ArraySortTest2/>
    <CustomMathTest/>
    <SubOrderTest/>
    <SubOrderTest2/>
    <IndexTest/>
    <ArrayRepeatTest/>
    <RepeatEveryTest/>
    <RepeatFilterTest/>
    <RepeatFindTest/>
    <RepeatMapTest/>
    <RepeatSomeTest/>
    <RepeatReduceTest/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
