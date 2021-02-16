const promise = new Promise(
  (resolve, reject) =>  {
    setTimeout(() => {
      console.log(`Hello`)
      resolve(`World!`)},2000)
  }
)

promise
  .then(response => console.log(response))
  .then(response => console.log(`Success`))
  .catch((error) => console.log(error))
  .finally(() => console.log(`PromiseTest6: 나는 무조건 실행도니다!!!`))

const PromiseTest6 = () => {
  console.log(`PromiseTest6 Start`)
  console.log(`PromiseTest6 Fin`)

  return (
    <div className = "PromiseTest6">
      <p>PromiseTest6</p>
    </div>
  )
}

export default PromiseTest6