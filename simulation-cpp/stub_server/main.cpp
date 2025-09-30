#include <iostream>
#include <string>
#include <cstring>
#include <sstream>
#include <httplib.h> 

using namespace httplib;

int main() {
    Server svr;

    svr.Post("/analyze", [](const Request &req, Response &res) {
        // basic echo / simulated analysis
        // expects JSON with fields: id, audioBase64, sketchBase64
        std::string body = req.body;
        // Simple simulated response
        std::string json = R"({"labels":["quick_note","sketch"],"confidence":[0.9,0.6]})";
        res.set_content(json, "application/json");
    });

    std::cout << "CPP stub server listening on :9000\n";
    svr.listen("0.0.0.0", 9000);
    return 0;
}

