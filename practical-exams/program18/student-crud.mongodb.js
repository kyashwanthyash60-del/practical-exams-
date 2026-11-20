use studentdb

db.students.insertOne({ regNo: "101", name: "Asha", branch: "CSE", semester: 5 })
db.students.insertMany([
  { regNo: "102", name: "Rahul", branch: "ECE", semester: 4 },
  { regNo: "103", name: "Meena", branch: "ME", semester: 6 }
])

db.students.find()
db.students.find({ branch: "CSE" })
db.students.updateOne({ regNo: "101" }, { $set: { semester: 6 } })
db.students.find({ regNo: "101" })
db.students.deleteOne({ regNo: "103" })
db.students.find()
