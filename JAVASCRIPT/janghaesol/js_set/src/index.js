import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import NewMapTest from './map-test/NewMapTest';
import MapSetTest from './map-test/MapSetTest';
import MapDeleteTest from './map-test/MapDeleteTest';
import MapIterationTest from './map-test/MapIterationTest';
import NewMapInitTest from './map-test/NewMapInitTest';
import ForWithSetMap from './for-test/ForWithSetMap';
import IteratorTest from './iterator-test/IteratorTest';
import IteratorTest2 from './iterator-test/IteratorTest2';
import IteratorTest3 from './iterator-test/IteratorTest3';
import AddSetTest from './set-test/AddSetTest';
import ForEachWithSet from './set-test/ForEachWithSet';
import NewSetInitTest from './set-test/NewSetinitTest';
import NewSetTest from './set-test/NewSetTest';
import SetEntryIterationTest from './set-test/SetEntryIterationTest';
import SetKeyIterationTest from './set-test/SetKeyIterationTest';

ReactDOM.render(
  <React.StrictMode>
    <ForWithSetMap/>
    <IteratorTest/>
    <IteratorTest2/>
    <IteratorTest3/>
    <MapDeleteTest/>
    <MapIterationTest/>
    <MapSetTest/>
    <NewMapInitTest/>
    <NewMapTest/>
    <AddSetTest/>
    <ForEachWithSet/>
    <NewSetInitTest/>
    <NewSetTest/>
    <SetEntryIterationTest/>
    <SetKeyIterationTest/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
