print('###Creating user for the application###');
db.createUser(
        {
            user: "dexpense",
            pwd: "dexpense",
            roles: [
                {
                    role: "readWrite",
                    db: "gos-expense"
                }
            ]
        }
);
