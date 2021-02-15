import React from 'react'

function * getName() {
    console.log('generator');
    // yield를 통해 중간에 멈출 수 있다.
    // context-swiching
    yield 'david';

    console.log('generator');
    yield 'tom';

    console.log('generator end');
}

function * getMajor(){
    console.log('generator major');
    const major = yield 'which subject do you like?';

    console.log('generator major');
    const name = yield 'whats tour name?';

    return `${name} ${major}`;
}

const GeneratorTest = () => {

    let nameIter = getName();

    console.log(nameIter.next());
    console.log(nameIter.next());
    console.log(nameIter.next());
    console.log(nameIter.next());
    
    let majorIter = getMajor();

    console.log(majorIter.next());
    console.log(majorIter.next('signal'));
    console.log(majorIter.next('john'));
    
    return (
        <div>
            
        </div>
    )
}

export default GeneratorTest;
