import React from 'react';
import ReactDOM from 'react-dom';
import ArrowFunctionTest from './js_array/arrow-test/ArrowFunctionTest';
import ArrowFunctionTest2 from './js_array/arrow-test/ArrowFunctionTest2';
import ArrowFunctionTest3 from './js_array/arrow-test/ArrowFunctionTest3';
import ArrowFunctionTest4 from './js_array/arrow-test/ArrowFunctionTest4';
import CustomMathTest from './custom-lib/CustomMathTest';
import SubOrderTest from './custom-lib/SubOrderTest';
import SubOrderTest2 from './custom-lib/SubOrderTest2';
import DefaultParam from './func-test/DefaultParam';
import FuncTest from './func-test/FuncTest';
import './index.css';
import ApplyMathTest from './js_array/apply-math/ApplyMathTest';
import ArraySortTest from './js_array/array-test/ArraySortTest';
import ArraySortTest2 from './js_array/array-test/ArraySortTest2';
import ArrayRepeatTest from './js_array/repeat-test/ArrayRepeatTest';
import RepeatEveryTest from './js_array/repeat-test/RepeatEveryTest';
import RepeatFilterTest from './js_array/repeat-test/RepeatFilterTest';
import RepeatFindTest from './js_array/repeat-test/RepeatFindTest';
import RepeatMapTest from './js_array/repeat-test/RepeatMapTest';
import RepeatReduceTest from './js_array/repeat-test/RepeatReduceTest';
import RepeatSomeTest from './js_array/repeat-test/RepeatSomeTest';

import reportWebVitals from './reportWebVitals';
import Exercise01 from './exercise/Exercise01';

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
   <RepeatFindTest/>
   <ArrowFunctionTest/>
   <ArrowFunctionTest2/>
   <ArrowFunctionTest3/>
   <ArrowFunctionTest4/>
   <FuncTest/>
   <DefaultParam/>
   <Exercise01/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
