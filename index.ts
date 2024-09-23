/**
*
* This program calculates the energy an object can release
*
* By: Justin Lavoie
* Version: 1.0
* Since:   2024-09-23
*/

import { createPrompt } from 'bun-promptx'

// Mass input
const massString = createPrompt('Enter mass (kg): ')

// Mass float and error check
const mass = parseFloat(massString.value)
if (isNaN(mass) == true || mass < 0) {
  // Invalid input
  console.log('Invalid input.')
} else {
  // Valid input
  const energyReleased = (mass * ((2.998 * (10**8))**2)).toExponential()
  console.log(`A ${mass} kg object would produce ${energyReleased} J of energy.`)
}

// Show the program as done
console.log('\nDone.')