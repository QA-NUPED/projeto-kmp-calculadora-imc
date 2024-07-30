import SwiftUI
import shared

struct ContentView: View {
    @State private var weight: String = ""
    @State private var height: String = ""
    @State private var result: String = ""

    let bmiCalculator = BMICalculator()

    var body: some View {
        VStack {
            TextField("Weight (kg)", text: $weight)
                .keyboardType(.decimalPad)
                .padding()

            TextField("Height (m)", text: $height)
                .keyboardType(.decimalPad)
                .padding()

            Button(action: calculateBMI) {
                Text("Calculate BMI")
            }
            .padding()

            Text(result)
                .padding()
        }
        .padding()
    }

    func calculateBMI() {
        guard let weight = Double(weight), let height = Double(height) else {
            result = "Please enter valid numbers"
            return
        }

        let bmi = bmiCalculator.calculateBMI(weight: weight, height: height)
        let category = bmiCalculator.getBMICategory(bmi: bmi)
        result = String(format: "BMI: %.2f\nCategory: %@", bmi, category)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
