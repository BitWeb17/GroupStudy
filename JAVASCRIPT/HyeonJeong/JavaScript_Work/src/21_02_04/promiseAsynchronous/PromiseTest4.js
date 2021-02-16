const promise = new Promise(
  (resolve,reject) => {
    setTimeout(() => {
      console.log(`Hello`)
      reject(`Error`)},2000)
  }
)

promise
  .then((response) => console.log(`Success`))
  .catch((error) => console.log(error))
  .finally(() => console.log(`나는 무조건 실행된다!!!`))

const PromiseTest4 = () => {
  console.log(`PromiseTest4 Start`)
  console.log(`PromiseTEst4 Fin`)

  return (
  <div className="PromiseTest4">
  <p>PromiseTest4</p>
  </div>
  )
}

export default PromiseTest4
