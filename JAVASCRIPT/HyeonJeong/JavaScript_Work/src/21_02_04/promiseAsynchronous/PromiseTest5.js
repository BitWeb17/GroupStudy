const promise = new Promise(
  (resolve, reject) => {
    setTimeout(() => {
      console.log(`Hello`)
      resolve(`World!`)},2000)
  }
)

// resolve()는 rpomise.then
// reject()는 promise.catch
// finally는 무조건
promise
  .then(response => console.log(`Success`))
  .catch(error => console.log(error))
  .finally(() => console.log(`PromiseTest5: 나는 무조건 실행된다!!!`))

const PromiseTest5 = () => {
  console.log(`PromiseTest Start`)
  console.log(`PromiseTset5 Fin`)

  return (
    <div className = "PromiseTest5">
      <p>PromiseTest5</p>
    </div>
  )
}

export default PromiseTest5
