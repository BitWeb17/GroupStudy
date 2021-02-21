function plus (num1, num2) {
	return new promise((resolve,reject) => {
		setTimeout(() => { 
			var res = num1 + num2

			console.log(`${num1} + ${num2}`)
			resolve(res)
		},4000)
	})
}

function minus (num1, num2) {
	return new Promise((resolve, reject) => {
		setTimeout(() => {
			var res = num1 - num2

			console.log(num1 + " - " + num2 + " = ")
			resolve(res)
		},2000)
	})
}

function mult (num1, num2) {
	return new Promise((resolve, reject) => {
		setTimeout(() => {
			var res = num1 * num2

			console.log(num1 + " * " + num2 + " = ")
			resolve(res)
		}, 1500)
	})
}

function divide (num1, num2) {
	return new Promise((resolve, reject) => {
		setTimeout(() => {
			var res = num1 / num2
			
			console.log(num1 + " / " + num2 + " = ")
			resolve(res)
		}, 1000)
	})
}

plus(100, 200)	
	.then((response) => {
		console.log("plus: " + response)
		return minus(100, 200)
	})
	.then((response) => {
		console.log("minus: " + response)
		return mult(100, 200)
	})
	.then((response) => {
		console.log("mult: " + response)
		return divide(100, 200)
	})
	.then((response) =>{
	console.log("divide: " + response)
	})

const PromiseParallelTest = () => {
	console.log("PromiseParallelTest Start")
	console.log("PromiseParallelTest Fin")

	return (
			<div className="PromiseParallelTest">
					<p>PromiseParallelTest</p>
			</div>
	)
}

export default PromiseParallelTest