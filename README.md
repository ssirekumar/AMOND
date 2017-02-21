# <img src="https://cloud.githubusercontent.com/assets/10174519/23180210/a3798cc0-f896-11e6-8ec3-8a57cdbbb208.png" alt="Amond command Help" width="150px" height="250px"></br> AMOND v2.1 
<b>Android MObile Number Device</b>

AMOND is a library and console tool to get all the android device information(Serial Number, Os Version, Build Number, Kernel version... etc). This will works mainly on android debug device (adb) commands with java programming. it's purely based on java IO classes. This tool will give you multiple connected device information into single CSV file.

<b>How to Use</b></br>

 <ol type="1">
  <li>Conncet your android single/multiple devices to machine(windows, linux, mac) and check Settings -> Developer Options     USB debugging is enabled or not.</li>
  <li>Run the <b>InfoAndroid.java</b> file with below diffrent command line arguments</li>
  <img src="https://cloud.githubusercontent.com/assets/10174519/15447501/ee12551e-1f61-11e6-8f31-1b2a80b4648e.png" alt="Amond command Help" style="width:304px;height:228px;">
 </ol>
  <ol type="1">
    <li><b>amond -c</b> --> Get the device information on console </li>
    <li><b>amond -csv</b> --> Write a csv file with default commands defined in amond library </li>
    <li><b>amond -config -c </b> --> Get the device information from user specified commands from "configuration_adb_commands.csv" file out put on console </li>
    <li><b>amond -config -csv </b> --> Write into a csv file from user specified commands from "configuration_adb_commands.csv" file </li>
  </ol>
  </br>
 
 <h4>OutPut of command</h4></br>
<img src="https://cloud.githubusercontent.com/assets/10174519/15447548/7be7808e-1f63-11e6-8179-ef4c3dd7d86c.png" alt="Amond output" style="width:304px;height:228px;">
 
 
 
Software License Agreement (<a href="https://opensource.org/licenses/BSD-2-Clause">BSD License</a>)</br>
<b>Copyright (c) 2016, Ssire Kumar All rights reserved.</b>

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
   






